function isLeapYear(year){
    if (year%4==0){
        return true;
    }
    else{
        return false;
    }
}

var y= prompt('확인하고 싶은 년도를 입력하세요')
console.log(y)
console.log(isLeapYear(y))