package com.core;

import com.Project.UserInterface;

/**
 * executor
 */
public class executor {

    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args[0]) {
                case "create":
                    switch (args[1]) {
                        case "model":
                            if (args.length < 3) {
                                System.out.println("failed to execute process, need 1 argument");
                                System.exit(1);
                            }
                            generateModel(args[2]);
                            break;
                        case "fileStrategy":
                            if (args.length < 3) {
                                System.out.println("failed to execute process, need 1 argument");
                                System.exit(1);
                            }
                            generateFileStrategy(args[2]);
                            break;

                        default:
                            break;
                    }
                    break;
                case "run":
                    runApp();
                    break;
                default:
                    System.out.println("unknown command");
                    break;
            }
        }
        runApp();
    }

    public static void generateModel(String modelName) {

    }

    public static void generateFileStrategy(String fileStrategyName) {

    }

    public static void runApp() {
        UserInterface.runApp();
    }
}
