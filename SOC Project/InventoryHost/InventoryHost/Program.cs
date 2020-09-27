using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace InventoryHost
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(InventoryService.Inventory);
            Uri tcp = new Uri("net.tcp://localhost:8010/InventoryService");
            Uri http = new Uri("http://localhost:8000/InventoryService");
            ServiceHost host = new ServiceHost(t, tcp, http);
            host.Open();
            Console.WriteLine("Service Running on http://localhost:8000/InventoryService");
            Console.ReadLine();
            host.Close();

        }
    }
}
