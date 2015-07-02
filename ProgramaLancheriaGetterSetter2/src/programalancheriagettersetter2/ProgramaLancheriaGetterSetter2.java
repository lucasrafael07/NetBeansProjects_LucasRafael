package programalancheriagettersetter2;

public class ProgramaLancheriaGetterSetter2 {
    
    public static void main(String[] args) {
        
        Lancheria a = new Lancheria(0);
        Calculos b = new Calculos();
        ES c = new ES();
        a.setCodigo(c.lerInteiro("DIGITE O CODIGO DO PRODUTO: "));
        b.selecionarCod(a.getCodigo());
        
    }
    
}
