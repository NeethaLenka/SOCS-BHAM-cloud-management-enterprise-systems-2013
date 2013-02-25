package EnterpriseSystems.CloudManager.DroolsManagement;

import EnterpriseSystems.CloudManager.Model.Blade;
import EnterpriseSystems.CloudManager.Model.VM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Luke
 * Date: 25/02/2013
 * Time: 10:18
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        DroolsConfiguration configuration = new DroolsConfiguration();
        configuration.Init();
        VM v1 = new VM();
        v1.setID((long) 1);
        v1.setMemoryUsage_current(500);
        v1.setMemoryUsage_maximum(1000);
        v1.setCpuUsage_current(10);
        v1.setCpuUsage_maximum(20);
        v1.setDiskUsage_current(200);
        v1.setDiskUsage_current(300);
        v1.setNetworkUsage_current(15);
        v1.setNetworkUsage_maximum(30);

        VM v2 = new VM();
        v2.setID((long) 2);
        v2.setMemoryUsage_current(500);
        v2.setMemoryUsage_maximum(1000);
        v2.setCpuUsage_current(10);
        v2.setCpuUsage_maximum(20);
        v2.setDiskUsage_current(200);
        v2.setDiskUsage_current(300);
        v2.setNetworkUsage_current(15);
        v2.setNetworkUsage_maximum(30);

        VM v3 = new VM();
        v3.setID((long) 3);
        v3.setMemoryUsage_current(500);
        v3.setMemoryUsage_maximum(1000);
        v3.setCpuUsage_current(10);
        v3.setCpuUsage_maximum(20);
        v3.setDiskUsage_current(200);
        v3.setDiskUsage_current(300);
        v3.setNetworkUsage_current(15);
        v3.setNetworkUsage_maximum(30);

        VM v4 = new VM();
        v4.setID((long) 4);
        v4.setMemoryUsage_current(500);
        v4.setMemoryUsage_maximum(1000);
        v4.setCpuUsage_current(10);
        v4.setCpuUsage_maximum(20);
        v4.setDiskUsage_current(200);
        v4.setDiskUsage_current(300);
        v4.setNetworkUsage_current(15);
        v4.setNetworkUsage_maximum(30);

        VM v5 = new VM();
        v5.setID((long) 5);
        v5.setMemoryUsage_current(500);
        v5.setMemoryUsage_maximum(1000);
        v5.setCpuUsage_current(10);
        v5.setCpuUsage_maximum(20);
        v5.setDiskUsage_current(200);
        v5.setDiskUsage_current(300);
        v5.setNetworkUsage_current(15);
        v5.setNetworkUsage_maximum(30);

        VM v6 = new VM();
        v6.setID((long) 6);
        v6.setMemoryUsage_current(500);
        v6.setMemoryUsage_maximum(1000);
        v6.setCpuUsage_current(10);
        v6.setCpuUsage_maximum(20);
        v6.setDiskUsage_current(200);
        v6.setDiskUsage_current(300);
        v6.setNetworkUsage_current(15);
        v6.setNetworkUsage_maximum(30);

        VM v7 = new VM();
        v7.setID((long) 7);
        v7.setMemoryUsage_current(500);
        v7.setMemoryUsage_maximum(1000);
        v7.setCpuUsage_current(10);
        v7.setCpuUsage_maximum(20);
        v7.setDiskUsage_current(200);
        v7.setDiskUsage_current(300);
        v7.setNetworkUsage_current(15);
        v7.setNetworkUsage_maximum(30);

        VM v8 = new VM();
        v8.setID((long) 8);
        v8.setMemoryUsage_current(500);
        v8.setMemoryUsage_maximum(1000);
        v8.setCpuUsage_current(10);
        v8.setCpuUsage_maximum(20);
        v8.setDiskUsage_current(200);
        v8.setDiskUsage_current(300);
        v8.setNetworkUsage_current(15);
        v8.setNetworkUsage_maximum(30);

        VM v9 = new VM();
        v9.setID((long) 9);
        v9.setMemoryUsage_current(500);
        v9.setMemoryUsage_maximum(1000);
        v9.setCpuUsage_current(10);
        v9.setCpuUsage_maximum(20);
        v9.setDiskUsage_current(200);
        v9.setDiskUsage_current(300);
        v9.setNetworkUsage_current(15);
        v9.setNetworkUsage_maximum(30);


        Blade b1 = new Blade();
        b1.setID((long) 1);
        b1.setMemory_total((double) 8000);
        b1.setMemoryUsage_current((double) 6000);
        b1.setDisk_total((double) 320);
        b1.setDiskUsage_current((double) 180);
        b1.setNetwork_total((double) 300);
        b1.setNetworkUsage_current((double) 200);
        b1.setCpuUsage_current((double) 65);
        b1.setVmAmount((long) 3);
        b1.AddVM(v1);
        b1.AddVM(v2);
        b1.AddVM(v3);

        Blade b2 = new Blade();
        b2.setID((long) 2);
        b2.setMemory_total((double) 8000);
        b2.setMemoryUsage_current((double) 6000);
        b2.setDisk_total((double) 320);
        b2.setDiskUsage_current((double) 180);
        b2.setNetwork_total((double) 300);
        b2.setNetworkUsage_current((double) 200);
        b2.setCpuUsage_current((double) 45);
        b2.setVmAmount((long) 3);
        b2.AddVM(v4);
        b2.AddVM(v5);
        b2.AddVM(v6);

        Blade b3 = new Blade();
        b3.setID((long) 3);
        b3.setMemory_total((double) 8000);
        b3.setMemoryUsage_current((double) 6000);
        b3.setDisk_total((double) 320);
        b3.setDiskUsage_current((double) 180);
        b3.setNetwork_total((double) 300);
        b3.setNetworkUsage_current((double) 200);
        b3.setCpuUsage_current((double) 45);
        b3.setVmAmount((long) 3);
        b3.AddVM(v7);
        b3.AddVM(v8);
        b3.AddVM(v9);

        List<Object> list = new ArrayList<Object>();
        list.add(b1);
        list.add(b2);
        list.add(b3);

        configuration.addToEngine(list);

    }


}
