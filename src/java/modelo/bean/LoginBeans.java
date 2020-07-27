
package modelo.bean;

import java.util.Date;

public class LoginBeans {
    
    private String nombre;
    private String password;
    private Date fecha;

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    


    public String acceder (){
        if (this.nombre.equals("Admin")){
            return "Ingreso Admitido";}
        else {
            return "ingreso Denegado";
        }
    }
    
}
