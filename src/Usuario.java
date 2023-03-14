public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("smarttv ligada" + smartTv.ligada);
        System.out.println("canal atual" + smartTv.canal);
        System.out.println("volume autual" + smartTv.volume);
        smartTv.ligar();
        System.out.println("novo status" + smartTv.ligada);
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        System.out.println("volume atual" + smartTv.volume); smartTv.MudarCanal(12);
        System.out.println(smartTv.canal);
    }
}
