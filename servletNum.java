//package beans;
import java.io.*;
//Servlets
import javax.servlet.*;
import javax.servlet.http.*;
//import beans.auxBean;
//---------------------------------------------------CLASE servletSuma--------------------------------------------------------------
public class servletNum extends HttpServlet 
{
    auxBean ab;
    Integer n = 0;   
//-------------------------------------------------------------SERVLET.DOGET()--------------------------------------------------------------    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {        
        ab = new auxBean();
        String first = n.toString();
        ab.setParameter(first);
        //ab.getParameter();
        req.setAttribute("laBean",ab);
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/pag.jsp");
        rd.forward(req,res);
    }//doGet
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {   
        n = n+1;     
        String a = n.toString();        
        ab.setParameter(a);        
        req.setAttribute("laBean",ab);
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/pag.jsp");
        rd.forward(req,res);
    }//doPost    
//---------------------------------------------------------FUNCTIONS------------------------------------------------------------------------    

/*public class auxBean
{
    private String num = "0";
    //private Integer p2;
    //private String suma;
    public auxBean(){}
    
    
    public String getParameter()
    {        
        return (num);
    }
    public void setParameter(String num)
    {
        this.num = num;        
    }    
}*/
}//Fin SINT48P2

//-------------------------------------------------------------------------------END--------------------------------------------------------------------
