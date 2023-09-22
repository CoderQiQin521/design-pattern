package org.example.state;

public class DispenseState extends State {

        RaffleActivity activity;

        public DispenseState(RaffleActivity activity) {
            this.activity = activity;
        }

        @Override
        public void deductMoney() {
            System.out.println("不能扣除积分");
        }

        @Override
        public boolean raffle() {
            System.out.println("不能抽奖");
            return false;
        }

        @Override
        public void dispensePrize() {
            if (activity.getCount() > 0) {
                System.out.println("恭喜中奖了");
                activity.setState(activity.getDispenseOutState());
                // 改变状态为不能抽奖
//                activity.setState(activity.getNoRaffleState());


            } else {
                System.out.println("很遗憾，奖品发送完了");
                // 改变状态为奖品发送完毕，后面我们就不可以抽奖
                activity.setState(activity.getDispenseOutState());
            }
        }
}
