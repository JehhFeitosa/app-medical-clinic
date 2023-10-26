package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        //não pode ser vazio e null
        @NotBlank
        String nome,

        @NotBlank
        //verifica se o formato é de email
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        //expressão regular que verifica se o campo é digito e tem de 4 a 6 digitos
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        //valida as anotacoes do DTO endereco
        @Valid
        DadosEndereco endereco) {
}
