function solution(angle) {
    var answer = 0;
    if(angle == 90){
        answer = 2
    } else if (angle > 90 && 180 > angle) {
        answer = 3
    } else if (angle > 0 && 90 > angle) {
        answer = 1
    } else {
        answer = 4
    }
    
    return answer;
}