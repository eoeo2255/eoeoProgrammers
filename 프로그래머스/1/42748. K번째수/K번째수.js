function solution(array, commands) {
    let answer = [];

    for (let i = 0; i < commands.length; i++) {
        let start = commands[i][0];
        let end = commands[i][1];

        let arr = array.slice(start - 1, end).sort((a, b) => a - b);

        answer.push(arr[commands[i][2]-1]);
    }

    return answer;
}