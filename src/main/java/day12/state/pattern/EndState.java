package day12.state.pattern;


class EndState extends AbstractState
{	
	// In the EndState none of the behavior is available
	public void onEntry() { super.onEntry(); }
	public void doWhileInState() {}
	public void onExit() {}
	public void timeout() {}
}
