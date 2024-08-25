package Module2.Course2;

import java.io.*;
import java.util.*;

class Level implements Serializable {
    private static final long serialVersionUID = 1L;
    private int levelNumber;
    private String environment;

    public Level(int levelNumber, String environment) {
        this.levelNumber = levelNumber;
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "Level " + levelNumber + " [" + environment + "]";
    }
}

class Achievement implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;

    public Achievement(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Achievement: " + name + " - " + description;
    }
}

class InventoryItem implements Serializable {
    private static final long serialVersionUID = 1L;
    private String itemName;
    private int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return itemName + " (x" + quantity + ")";
    }
}

class GameState implements Serializable {
    private static final long serialVersionUID = 1L;
    private String playerName;
    private List<Level> levelsCompleted;
    private List<Achievement> achievementsUnlocked;
    private List<InventoryItem> playerInventory;

    public GameState(String playerName) {
        this.playerName = playerName;
        this.levelsCompleted = new ArrayList<>();
        this.achievementsUnlocked = new ArrayList<>();
        this.playerInventory = new ArrayList<>();
    }

    public void completeLevel(Level level) {
        levelsCompleted.add(level);
    }

    public void unlockAchievement(Achievement achievement) {
        achievementsUnlocked.add(achievement);
    }

    public void addItemToInventory(InventoryItem item) {
        playerInventory.add(item);
    }

    @Override
    public String toString() {
        return "Player: " + playerName + "\nLevels Completed: " + levelsCompleted +
                "\nAchievements: " + achievementsUnlocked + "\nInventory: " + playerInventory;
    }
}

public class GameProgressManager {

    public static void saveGameState(GameState gameState, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(gameState);
            System.out.println("Game state saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameState loadGameState(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (GameState) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        GameState gameState = new GameState("PlayerOne");

        gameState.completeLevel(new Level(1, "Forest"));
        gameState.completeLevel(new Level(2, "Desert"));

        gameState.unlockAchievement(new Achievement("First Blood", "Defeat your first enemy"));
        gameState.unlockAchievement(new Achievement("Treasure Hunter", "Find a hidden treasure"));

        gameState.addItemToInventory(new InventoryItem("Health Potion", 3));
        gameState.addItemToInventory(new InventoryItem("Sword", 1));

        String filePath = "game_state.ser";
        saveGameState(gameState, filePath);

        GameState loadedGameState = loadGameState(filePath);
        System.out.println("\nLoaded Game State:\n" + loadedGameState);
    }
}
