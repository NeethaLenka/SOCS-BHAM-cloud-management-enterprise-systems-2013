package EnterpriseSystems.CloudManager.DroolsManagement;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.conf.EventProcessingOption;
import org.drools.runtime.StatefulKnowledgeSession;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.drools.builder.ResourceType.DRL;
import static org.drools.io.ResourceFactory.newClassPathResource;

/**
 * Created with IntelliJ IDEA.
 * User: Luke
 * Date: 23/02/2013
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */
public class DroolsInit {

    public void Init() {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        kbuilder.batch().add( newClassPathResource( "Energy.drl", getClass()  ), DRL )
                        .add( newClassPathResource( "Overload.drl", getClass() ), DRL ).build();
        if ( kbuilder.hasErrors() ) {
            throw new RuntimeException( kbuilder.getErrors().toString() );
        }

        KnowledgeBaseConfiguration config = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
        config.setOption( EventProcessingOption.STREAM );
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase( config );
        kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
        StatefulKnowledgeSession knowledgeSession = kbase.newStatefulKnowledgeSession();

        runKnowledgeSession(knowledgeSession);
    }

    private void runKnowledgeSession(StatefulKnowledgeSession ksession) {
        final StatefulKnowledgeSession knowledgeSession = ksession;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            public void run() {
                // run forever
                knowledgeSession.fireUntilHalt();
            }
        });
    }


}
