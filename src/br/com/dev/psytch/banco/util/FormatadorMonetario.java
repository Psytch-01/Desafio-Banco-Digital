package br.com.dev.psytch.banco.util;

import java.text.DecimalFormat;

public class FormatadorMonetario {

    public static String formatarMonetario(double valor) {
        DecimalFormat df = new DecimalFormat("R$ #, ##0.00");
        return df.format(valor);
    }
}
