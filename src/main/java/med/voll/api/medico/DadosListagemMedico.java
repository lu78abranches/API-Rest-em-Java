package med.voll.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) { //DTO da listagem de médicos
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
