using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InventoryClient
{
    public partial class AddProduct : System.Web.UI.Page
    {
        ServiceReference.InventoryInterfaceClient client;
        protected void Page_Load(object sender, EventArgs e)
        {
            client = new ServiceReference.InventoryInterfaceClient("BasicHttpBinding_InventoryInterface");
            if (!IsPostBack)
            {
                DropDownList1.DataSource = Application["CategoryList"];

                DropDownList1.DataBind();
                
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            
                string name = TextBox1.Text;
                decimal price = Decimal.Parse(TextBox2.Text);
                int stock = int.Parse(TextBox3.Text);
                string category = DropDownList1.Text;

                string msg=client.AddProduct(name, price, stock, category);
                Label5.Text = msg;
                Label5.Visible = true;
            
        }
    }
}