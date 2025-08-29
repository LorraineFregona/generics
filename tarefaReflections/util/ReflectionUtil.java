package util;

import annotations.Tabela;

public class ReflectionUtil {
    
    public static String getNomeTabela(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            return tabelaAnnotation.value();
        }
        throw new RuntimeException("Classe " + clazz.getSimpleName() + 
            " não possui a annotation @Tabela");
    }
}