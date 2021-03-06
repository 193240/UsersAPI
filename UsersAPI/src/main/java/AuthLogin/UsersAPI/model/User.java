package AuthLogin.UsersAPI.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "user")
    private String user;
    @Column(name = "password")
    private String  password;
    @Column(name = "tipoU")
    private String tipoU;
    @Column(name = "idDuenio")
    private int idDuenio;

    public User(){}

    public User(int idUsuario, String user, String password, String tipoU, int idDuenio) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.password = password;
        this.tipoU = tipoU;
        this.idDuenio = idDuenio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoU() {
        return tipoU;
    }

    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }
}