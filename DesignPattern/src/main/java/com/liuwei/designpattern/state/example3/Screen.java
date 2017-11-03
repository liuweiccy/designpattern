package com.liuwei.designpattern.state.example3;

/**
 * @author liuwei2
 */
public class Screen {
    private AbstractState currentAbstractState, normalAbstractState, largerAbstractState, largestAbstractState;

    public Screen() {
        normalAbstractState = new NormalAbstractState();
        largerAbstractState = new LargerAbstractState();
        largestAbstractState = new LargestAbstractState();
        currentAbstractState = normalAbstractState;
    }

    public void setState(AbstractState abstractState) {
        this.currentAbstractState = abstractState;
    }

    public void onClick() {
        if (currentAbstractState == normalAbstractState) {
            setState(largerAbstractState);
            currentAbstractState.display();
        } else if (currentAbstractState == largerAbstractState) {
            setState(largestAbstractState);
            currentAbstractState.display();
        } else if (currentAbstractState == largestAbstractState) {
            setState(normalAbstractState);
            currentAbstractState.display();
        }
    }
}
