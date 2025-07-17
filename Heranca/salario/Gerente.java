public class Gerente extends Empregado{


    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if(departamento.alcancouMeta()) {
            return super.calcularBonus(departamento) * 2 + 1.0;
        }
        return 0;
    }

}