package org.perpus.txt;

import org.perpus.core.DocumentProcessor;


public class PlainTextProcessor implements DocumentProcessor {

    @Override
    public String process(String content) {
        if (content == null) return "";
        // Contoh proses sederhana: trim + ganti beberapa token + hitung baris
        String trimmed = content.trim();
        long lineCount = trimmed.isEmpty() ? 0 : trimmed.lines().count();
        long wordCount = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        StringBuilder sb = new StringBuilder();
        sb.append("=== Plain Text Processed ===\n");
        sb.append("Lines: ").append(lineCount).append("\n");
        sb.append("Words: ").append(wordCount).append("\n\n");
        sb.append(trimmed).append("\n");
        sb.append("=== End ===");
        return sb.toString();
    }

    @Override
    public String getFormatName() {
        return "plain-text";
    }
}
