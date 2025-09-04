package com.tp2.password;

import java.util.List;

public class PasswordValidator {
    
    public boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach
        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
        if (password.length() < 8){
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;
        String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";


        for(int i = 0; i < password.length(); i++){
            char caracter = password.charAt(i);

            if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isUpperCase(caracter)){
                tieneMayuscula = true;
            } else if (Character.isDigit(caracter)){
                tieneNumero = true;
            } else if (caracteresEspeciales.indexOf(caracter) >= 0) {
                tieneCaracterEspecial = true;
            }
        }

        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial){
            return true;
        } else {
            return false;
        }
    }
}
