package commandPattern;

/*
 * 2020.04.15
 * SW 설계
 * Park Seunghee
 * 
 * '명령'을 '객체'로 만드는 Pattern
 * 
 * 요구사항을 객체로 캡슐화 할 수 있으며, 인수를 사용하여 다른 요구사항도 집어넣을 수 있음.
 * 
 * */
public interface Command {
	
	public void execute();
	
}