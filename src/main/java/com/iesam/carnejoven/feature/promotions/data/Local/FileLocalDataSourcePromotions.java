package com.iesam.carnejoven.feature.promotions.data.Local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLocalDataSourcePromotions {
    private String nameFile = "Promotion.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<Promotion>() {
    }.getType();

    public void save(Promotion promotion) {
        ArrayList<Promotion> promotions = obtainAll(); // Obtener la lista actual de promociones.
        promotions.add(promotion); // Añadir la nueva promoción a la lista.

        try (FileWriter writer = new FileWriter(nameFile)) {
            gson.toJson(promotions, writer); // Guardar la lista actualizada en el archivo.
            System.out.println("Promoción guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la promoción: " + e.getMessage());
        }
    }


    public Promotion obtain(String id) {
        List<Promotion> promotions = obtainAll(); // Usa el método obtainAll para obtener todas las promociones.
        for (Promotion promotion : promotions) {
            if (promotion.id.equals(id)) {
                return promotion; // Devuelve la promoción específica si el ID coincide.
            }
        }
        return null; // Devuelve null si no se encuentra la promoción con el ID dado.
    }


    public void deleteById(String id) {
        ArrayList<Promotion> promotions = obtainAll(); // Obtener todas las promociones.
        // Utiliza removeIf para eliminar la promoción que coincida con el ID proporcionado.
        boolean isRemoved = promotions.removeIf(promotion -> promotion.id.equals(id));

        if (isRemoved) {
            // Si se eliminó alguna promoción, guarda la lista actualizada de nuevo en el archivo.
            try (FileWriter writer = new FileWriter(nameFile)) {
                gson.toJson(promotions, writer); // Guardar la lista actualizada en el archivo.
                System.out.println("Promoción eliminada correctamente.");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al eliminar la promoción: " + e.getMessage());
            }
        }
    }




    public ArrayList<Promotion> obtainAll() {
        File file = new File(nameFile);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>(); // Devolver una lista vacía si el archivo no existe o está vacío.
        }

        try (Scanner scanner = new Scanner(file)) {
            String content = scanner.useDelimiter("\\A").next();
            return gson.fromJson(content, new TypeToken<ArrayList<Promotion>>(){}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al leer las promociones: " + e.getMessage());
        }

        return new ArrayList<>(); // Devolver una lista vacía en caso de error.
    }

}
