package estacionamento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estacionamento {

    public static void main(String[] args) {
        calcularDiferencaHoras("14:25:00", "15:00:00");
    }

    public static void calcularDiferencaHoras(String horaInicial, String horaFinal) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        try {

            Date horaIni = sdf.parse(horaInicial);
            Date horaFim = sdf.parse(horaFinal);

            long horaI = horaIni.getTime();
            long horaF = horaFim.getTime();

            long diferencaHoras = horaF - horaI;

            long segundos = (diferencaHoras / 1000) % 60;      // se não precisar de segundos, basta remover esta linha.
            long minutos = (diferencaHoras / 60000) % 60;     // 60000   = 60 * 1000
            long horas = diferencaHoras / 3600000;            // 3600000 = 60 * 60 * 1000
            System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));

        } catch (Exception ex) {
            System.out.println("Erro");
        }
    }
}
