package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final InputView inputView;
    private final OutputView outputView;

    public BridgeGame(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void runBridgeGame(BridgeMaker bridgeMaker) {
        outputView.printStartMessage();
        int bridgeSize = inputView.readBridgeSize();
        List<String> bridge = bridgeMaker.makeBridge(bridgeSize);
        int index = 0;
        while (true) {
            boolean result = proceedBridgeGame(bridge, index);
            handleResult(result);
        }
    }

    // true: 성공, false: 실패
    public boolean proceedBridgeGame(List<String> bridge, int index) {
        String direction = inputView.readMoving();
        return move(bridge, index, direction);
    }

    public void handleResult(boolean result) {
        if (!result) handleFailedCase();
    }

    public void handleFailedCase() {

    }


    public boolean move(List<String> bridge, int index, String direction) {
        if (bridge.get(index).equals(direction)) return true;
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
