<%@ Page Language="C#" AutoEventWireup="true" MasterPageFile="~/Site.Master" CodeBehind="AddProduct.aspx.cs" Inherits="InventoryClient.AddProduct" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    
        <style>
  input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div.add {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
        <div class="add">
            <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
            <br />
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator
            id="reqName"
            ControlToValidate="TextBox1"
            Text="*Required"
            Runat="server" SetFocusOnError="True" />
        
        <p>
            <asp:Label ID="Label2" runat="server" Text="Price"></asp:Label>
            <br />
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator
            id="RequiredFieldValidator2"
            ControlToValidate="TextBox2"
            Text="*Required"
            Runat="server" SetFocusOnError="True" />
        </p>
        <p>
            <asp:Label ID="Label3" runat="server" Text="Stock"></asp:Label>
            <br />
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator
            id="RequiredFieldValidator3"
            ControlToValidate="TextBox3"
            Text="*Required"
            Runat="server" SetFocusOnError="True" />
        </p>
        <asp:Label ID="Label4" runat="server" Text="Category"></asp:Label>
            <br />
        <asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True">
        </asp:DropDownList>
        <p>
            <asp:Button ID="Button1" runat="server" Text="Add Product" OnClick="Button1_Click" />
        </p>
        <p>
            <asp:Label ID="Label5" runat="server" Text="label" Visible="False"></asp:Label>
        </p>
            </div>

        </asp:Content>