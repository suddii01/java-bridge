package bridge;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
        BridgeGame bridgeGame = new BridgeGame(inputView, outputView);
        bridgeGame.runBridgeGame(bridgeMaker);
    }
}
