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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario",
        schema = "public"
)
public class Usuario implements java.io.Serializable {

    private int idusuario;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String senha;
    private String rg;
    private String cep;
    private String uf;
    private String cidade;
    private String login;
    private String email;
    private Date nascimento;
    private String bairro;
    private Set<Transplante> transplantes = new HashSet<Transplante>(0);
    private Set<Orgao> orgaos = new HashSet<Orgao>(0);
    private Set<Responsavel> responsavels = new HashSet<Responsavel>(0);
    private Set<Doador> doadors = new HashSet<Doador>(0);
    private Set<Receptor> receptors = new HashSet<Receptor>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idusuario", nullable = false)
    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    @Column(name = "senha", length = 10)
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "rg", length = 9)
    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    @Column(name = "cidade", length = 50)
    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Column(name = "login", length = 15)
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "email", length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento", length = 13)
    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    @Column(name = "bairro", length = 10)
    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Transplante> getTransplantes() {
        return this.transplantes;
    }

    public void setTransplantes(Set<Transplante> transplantes) {
        this.transplantes = transplantes;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Orgao> getOrgaos() {
        return this.orgaos;
    }

    public void setOrgaos(Set<Orgao> orgaos) {
        this.orgaos = orgaos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Responsavel> getResponsavels() {
        return this.responsavels;
    }

    public void setResponsavels(Set<Responsavel> responsavels) {
        this.responsavels = responsavels;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Doador> getDoadors() {
        return this.doadors;
    }

    public void setDoadors(Set<Doador> doadors) {
        this.doadors = doadors;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Receptor> getReceptors() {
        return this.receptors;
    }

    public void setReceptors(Set<Receptor> receptors) {
        this.receptors = receptors;
    }

}
