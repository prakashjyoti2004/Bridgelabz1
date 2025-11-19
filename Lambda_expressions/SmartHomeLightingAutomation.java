public class SmartHomeLightingAutomation {
    interface LightBehavior {
        void activate();
    }
    public static void main(String[] args) {
        LightBehavior motionTrigger = () -> System.out.println("Lights ON: Motion detected.");
        LightBehavior timeTrigger = () -> System.out.println("Lights ON: Evening mode activated.");
        LightBehavior voiceTrigger = () -> System.out.println("Lights ON: Voice command executed.");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}