package digital.innovation.one.uils.Operacao.Internal;

import digital.innovation.one.uils.Operacao.Operacao;

public class SubHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a-b;
    }
}
