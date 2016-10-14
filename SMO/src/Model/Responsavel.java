package Model;
// Generated Oct 13, 2016 9:39:59 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Responsavel generated by hbm2java
 */
@Entity
@Table(name = "responsavel",
         schema = "public"
)
public class Responsavel implements java.io.Serializable {

    private int idresponsavel;
    private Usuario usuario;
    private String nome;
    private String cpf;
    private String cep;
    private String uf;
    private String endereco;
    private String telefone;
    private String email;
    private String cidade;
    private String bairro;
    private String rg;
    private Date nascimento;
    private Set<Doador> doadors = new HashSet<Doador>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idresponsavel", nullable = false)
    public int getIdresponsavel() {
        return this.idresponsavel;
    }

    public void setIdresponsavel(int idresponsavel) {
        this.idresponsavel = idresponsavel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "nome", length = 150)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cpf", length = 14)
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(name = "cep", length = 9)
    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "uf", length = 2)
    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Column(name = "endereco", length = 150)
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "telefone", length = 15)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "email", length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cidade", length = 50)
    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Column(name = "bairro", length = 100)
    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "rg", length = 9)
    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento", length = 13)
    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "responsavel")
    public Set<Doador> getDoadors() {
        return this.doadors;
    }

    public void setDoadors(Set<Doador> doadors) {
        this.doadors = doadors;
    }

}
