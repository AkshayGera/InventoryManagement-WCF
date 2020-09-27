using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Optimization;
using System.Web.Routing;
using System.Web.Security;
using System.Web.SessionState;

namespace InventoryClient
{
    public class Global : HttpApplication
    {
        void Application_Start(object sender, EventArgs e)
        {
            // Code that runs on application startup
            RouteConfig.RegisterRoutes(RouteTable.Routes);
            BundleConfig.RegisterBundles(BundleTable.Bundles);
            List<string> cats = new List<string>();
            cats.Add("peripherals");
            cats.Add("storage");
            cats.Add("audio");
            cats.Add("video");
            cats.Add("processor");
            cats.Add("gpu");
            cats.Add("misc");
            Application["CategoryList"] = cats;
            Application["ProductId"] = "";

        }
    }
}