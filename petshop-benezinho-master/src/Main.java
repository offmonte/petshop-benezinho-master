import br.com.holding.pessoa.model.Pessoa;
import br.com.holding.pessoa.model.PessoaFisica;
import br.com.holding.pessoa.model.PessoaJuridica;
import br.com.holding.animal.model.Animal;
import br.com.holding.documento.model.Documento;
import br.com.holding.servico.model.Servico;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Objects;

public class Main {


    public static PessoaFisica novaPessoa(Long id, String nome, LocalDate nascimento, String cpf){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setNascimento(nascimento);
        pf.setCpf(cpf);

        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, LocalDate fundacao, String CNPJ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setNascimento(fundacao);
        pj.setCNPJ(CNPJ);

        return pj;
    }

    public static Servico novoServico(Long id, String nome, String descricao, Double valor){
        Servico sv = new Servico();
        sv.setId(id);
        sv.setNome(nome);
        sv.setDescricao(descricao);
        sv.setValor(valor);

        return sv;
    }

    public static Animal novoAnimal(Long id, String nome, String raca){
        Animal pr = new Animal();
        pr.setId(id);
        pr.setNome(nome);
        pr.setRaca(raca);

        return pr;
    }

    public static Documento novoDocumento(Long id, String numero, Pessoa pessoa){
        Documento lg = new Documento();
        lg.setId(id);
        lg.setNumero(numero);
        lg.setPessoa(pessoa);

        return lg;
    }

    public static void main(String[] args) {

        PessoaFisica nicolas = novaPessoa
                (54321L,"Hernan Reyes",
                        LocalDate.of(2002,11,12),"123.345.678-90");
        PessoaFisica nicolasJn = novaPessoa
                (54321L,"Dante Reyes",
                        LocalDate.of(2032,8,12),"098.765.43-21");

        PessoaJuridica bar = novaPessoaJuridica
                (1234L, "Bar do Claudio",
                        LocalDate.of(2010,6,16), "12.123.123/0001-02");

        Animal duke = novoAnimal(123456L, "duke", "spitz alemão");

        Servico banho = novoServico(99191L,"Barmen do Barni");

        Documento doc = novoDocumento(54321L,"098.765.43-21","Dante Reyes");

    }
}