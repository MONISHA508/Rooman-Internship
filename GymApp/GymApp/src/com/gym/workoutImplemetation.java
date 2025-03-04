package com.gym;

public class workoutImplemetation implements IWorkout {
private Workout workouts[];
workoutImplemetation(){
	workouts=new Workout[5];
}
	@Override
	public void addWorkout(Workout workout, int index) {
		// TODO Auto-generated method stub
		workouts[index]=workout;
		
	}

	@Override
	public Workout displayWorkout(int i) {
		// TODO Auto-generated method stub
		return workouts[i];
	}

}
