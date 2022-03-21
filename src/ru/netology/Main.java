package ru.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        File dirSrc = new File("d:/IdeaProjects/Games/Src");
        File dirSave = new File("d:/IdeaProjects/Games/Save");
        File dirTemp = new File("d:/IdeaProjects/Games/Temp");
        File dirRes = new File("d:/IdeaProjects/Games/Res");
        File dirMain = new File("d:/IdeaProjects/Games/Src/Main");
        File dirTest = new File("d:/IdeaProjects/Games/Src/Test");
        File dirDraw = new File("d:/IdeaProjects/Games/Res/Drawables");
        File dirVectors = new File("d:/IdeaProjects/Games/Res/Vectors");
        File dirIcons = new File("d:/IdeaProjects/Games/Res/Icons");
        File fileTemp = new File("d:/IdeaProjects/Games/Temp/Temp.txt");
        File fileMain = new File("d:/IdeaProjects/Games/Src/Main/Main.java");
        File fileUtils = new File("d:/IdeaProjects/Games/Src/Main/Utils.java");

        if (dirSrc.mkdir())
            str.append("Директория " + dirSrc.getPath() + " создана.").append("\n");
        if (dirSave.mkdir())
            str.append("Директория " + dirSave.getPath() + " создана.").append("\n");
        if (dirTemp.mkdir())
            str.append("Директория " + dirTemp.getPath() + " создана.").append("\n");
        if (dirRes.mkdir())
            str.append("Директория " + dirRes.getPath() + " создана.").append("\n");
        if (dirMain.mkdir())
            str.append("Директория " + dirMain.getPath() + " создана.").append("\n");
        if (dirTest.mkdir())
            str.append("Директория " + dirTest.getPath() + " создана.").append("\n");
        if (dirDraw.mkdir())
            str.append("Директория " + dirDraw.getPath() + " создана.").append("\n");
        if (dirVectors.mkdir())
            str.append("Директория " + dirVectors.getPath() + " создана.").append("\n");
        if (dirIcons.mkdir())
            str.append("Директория " + dirIcons.getPath() + " создана.").append("\n");

        try {
            if (fileTemp.createNewFile())
                str.append("Файл " + fileTemp.getName() + " создан.").append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (fileMain.createNewFile())
                str.append("Файл " + fileMain.getName() + " создан.").append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (fileUtils.createNewFile())
                str.append("Файл " + fileUtils.getName() + " создан.").append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        FileWriter writer = new FileWriter(fileTemp.getPath());
        writer.write(String.valueOf(str));
        writer.close();
    }
}

