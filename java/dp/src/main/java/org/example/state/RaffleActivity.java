package org.example.state;

public class RaffleActivity {
// state 表示活动当前的状态，是变化
    State state = null;
    // 奖品数量
    int count = 0;

    // 四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    // 构造器
    // 1. 初始化当前的状态为 noRaffleState（即不能抽奖的状态）
    // 2. 初始化奖品的数量
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    // 扣分，调用当前状态的 deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    // 抽奖
    public void raffle() {
        // 如果当前状态是抽奖成功
        if (state.raffle()) {
            // 领取奖品
            state.dispensePrize();
        }
    }

    // 这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    // 每领取一次奖品，count--
    public void setCount(int count) {
        this.count = count;
    }

    // 这里请大家注意，每领取一次奖品，count--
    public State getState() {
        return state;
    }

    // state 表示活动当前的状态，是变化
    public void setState(State state) {
        this.state = state;
    }

    // 四个属性，表示四种状态
    public State getNoRaffleState() {
        return noRaffleState;
    }

    // 四个属性，表示四种状态
    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    // 四个属性，表示四种状态
    public State getCanRaffleState() {
        return canRaffleState;
    }

    // 四个属性，表示四种状态
    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    // 四个属性，表示四种状态
    public State getDispenseState() {
        return dispenseState;
    }

    // 四个属性，表示四种状态
    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
