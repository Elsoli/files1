package ru.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) { //throws IOException {
        StringBuilder str = new StringBuilder();
        List<String> dirListCreate = new ArrayList<>(Arrays.asList(
                "d:/IdeaProjects/Games/src",
                "d:/IdeaProjects/Games/res",
                "d:/IdeaProjects/Games/savegames",
                "d:/IdeaProjects/Games/temp",
                "d:/IdeaProjects/Games/src/main",
                "d:/IdeaProjects/Games/src/test",
                "d:/IdeaProjects/Games/res/drawables",
                "d:/IdeaProjects/Games/res/vectors",
                "d:/IdeaProjects/Games/res/icons"
        ));
        List<String> fileListCreate = new ArrayList<>(Arrays.asList(
                "d:/IdeaProjects/Games/Temp/Temp.txt",
                "d:/IdeaProjects/Games/Src/Main/Main.java",
                "d:/IdeaProjects/Games/Src/Main/Utils.java"
        ));

        for (String ds : dirListCreate) {
            File dir = new File(ds);
            if (dir.mkdir()) {
                str.append("Директория " + dir.getPath() + " создана").append("\n");
            }
        }

        for (String fs : fileListCreate) {
            File file = new File(fs);
            try {
                if (file.createNewFile()) {
                    str.append("Файл " + file.getPath() + " создан").append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File fileTemp = new File("d:/IdeaProjects/Games/Temp/Temp.txt");
        try {
            FileWriter writer = new FileWriter(fileTemp.getPath(), true);
            writer.write(String.valueOf(str));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }
}

