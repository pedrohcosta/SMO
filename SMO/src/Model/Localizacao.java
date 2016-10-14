package Model;
// Generated Oct 13, 2016 9:39:59 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Localizacao generated by hbm2java
 */
@Entity
@Table(name = "localizacao",
         schema = "public"
)
public class Localizacao implements java.io.Serializable {

    private String idlocalizacao;
    private Aparelho aparelho;
    private String latitude;
    private String longitude;
    private Date horaLoc;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idlocalizacao", nullable = false, length = 10)
    public String getIdlocalizacao() {
        return this.idlocalizacao;
    }

    public void setIdlocalizacao(String idlocalizacao) {
        this.idlocalizacao = idlocalizacao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaparelho", nullable = false)
    public Aparelho getAparelho() {
        return this.aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    @Column(name = "latitude", length = 10)
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", length = 10)
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_loc", length = 15)
    public Date getHoraLoc() {
        return this.horaLoc;
    }

    public void setHoraLoc(Date horaLoc) {
        this.horaLoc = horaLoc;
    }

}
