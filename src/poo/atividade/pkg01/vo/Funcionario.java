
package poo.atividade.pkg01.vo;

import java.util.Objects;


public class Funcionario extends Pessoa {
    private Setor setor;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(Funcionario.this.getCodigo());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(Funcionario.this.getCodigo(), other.getCodigo())) {
            return false;
        }
        return true;
    }
    
    
    
}
