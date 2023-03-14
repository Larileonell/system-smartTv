public class SmartTv {
    boolean ligada = false;
    int canal =1;
    int volume =25;
    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }
public void AumentarVolume(){
        volume ++;
    System.out.println("aumentando volume" + volume);
}
public void DiminuirVolume(){
        volume --;
    System.out.println("Diminuindo volume" +  volume);

}
public void AumentarCanal () {
    canal++;
    System.out.println("aumentando canal" + canal);
}
public void DiminuirCanal(){
        canal --;
        System.out.println("diminuindo o  canal" + canal);
    }
    public void MudarCanal (int NovoCanal){
        canal = NovoCanal;
    }
}

