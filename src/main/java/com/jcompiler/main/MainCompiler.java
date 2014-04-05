package com.jcompiler.main;

import com.jcompiler.analyzer.JavaLexicalAnalyzer;
import com.jcompiler.analyzer.LexicalAnalyzer;

/**
 * Created by cassandra on 4/4/14.
 */
public class MainCompiler {
    public static void main(String param[]) {
        if (param != null && param.length > 0) {

        } else {
            System.exit(compilerResult(param));
        }
    }

    private static int compilerResult(String[] param) {
        LexicalAnalyzer lexicalAnalyzer = new JavaLexicalAnalyzer();
        return 0;
    }
}
