package LambdaExpressions.SmartHomeLightingAutomation;

public class SmartLightController {

    public static void runLightPattern(LightAction action) {
        action.activate();
    }

    public static void main(String[] args) {

        // Motion detected
        LightAction motionTrigger = () ->
                System.out.println("Motion detected → Lights ON at full brightness");

        // Time-based trigger (Night mode)
        LightAction nightMode = () ->
                System.out.println("Night time → Dim lights at 30% brightness");

        // Voice command trigger
        LightAction voiceCommand = () ->
                System.out.println("Voice command → Blue ambient lights activated");

        // Execute different patterns dynamically
        runLightPattern(motionTrigger);
        runLightPattern(nightMode);
        runLightPattern(voiceCommand);
    }
}
