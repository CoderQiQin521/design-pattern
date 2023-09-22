package org.example.state;

public class DispenseOutState extends State {

        // 初始化时传入活动引用，扣除积分后改变其状态
        RaffleActivity activity;

        public DispenseOutState(RaffleActivity activity) {
            this.activity = activity;
        }

        // 当前状态不能扣积分
        @Override
        public void deductMoney() {
            System.out.println("奖品发送完了，请下次再参加");
        }

        // 当前状态不能抽奖
        @Override
        public boolean raffle() {
            System.out.println("奖品发送完了，请下次再参加");
            return false;
        }

        // 当前状态不能发放奖品
        @Override
        public void dispensePrize() {
            System.out.println("奖品发送完了，请下次再参加");
        }
}
