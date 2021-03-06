package digital.innovation.one.uils.Operacao;

import digital.innovation.one.uils.Operacao.Internal.DivHelper;
import digital.innovation.one.uils.Operacao.Internal.MultiHelper;
import digital.innovation.one.uils.Operacao.Internal.SubHelper;
import digital.innovation.one.uils.Operacao.Internal.SumHelper;

public class Cauculadora {
    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Cauculadora(){
        divHelper= new DivHelper();
        multiHelper =  new MultiHelper();
        subHelper = new SubHelper();
        sumHelper =  new SumHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b) {
        return subHelper.execute(a,b);
    }
    public int multi(int a, int b) {
        return multiHelper.execute(a,b);
    }
    public int div(int a, int b) {
        return divHelper.execute(a,b);
    }


}

