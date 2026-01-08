# Maven Project with Tests

이 프로젝트는 Java Maven 프로젝트로, 기본적인 유틸리티 클래스와 10개의 JUnit 테스트를 포함합니다..

## 프로젝트 구조

```
maven-project/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── Calculator.java      (계산기 클래스)
│   │               └── StringUtil.java      (문자열 유틸리티 클래스)
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   ├── CalculatorTest.java  (5개 테스트)
│                   └── StringUtilTest.java  (5개 테스트)
```

## 테스트 목록

### CalculatorTest (5개 테스트)
1. Test 1: Addition of positive numbers - 양수 덧셈 테스트
2. Test 2: Subtraction operation - 뺄셈 테스트
3. Test 3: Multiplication of numbers - 곱셈 테스트
4. Test 4: Division operation - 나눗셈 테스트
5. Test 5: Division by zero throws exception - 0으로 나누기 예외 테스트

### StringUtilTest (5개 테스트)
6. Test 6: Reverse a string - 문자열 뒤집기 테스트
7. Test 7: Check if string is palindrome - 회문 체크 테스트
8. Test 8: Count vowels in a string - 모음 개수 세기 테스트
9. Test 9: Capitalize first letter - 첫 글자 대문자화 테스트
10. Test 10: Check if string is null or empty - null/empty 체크 테스트

## 빌드 및 테스트 실행 방법

### 프로젝트 빌드
```bash
mvn clean compile
```

### 테스트 실행
```bash
mvn test
```

### 패키지 빌드
```bash
mvn clean package
```

## 요구사항

- Java 11 이상
- Maven 3.6 이상

## 의존성

- JUnit Jupiter 5.9.3 (테스트 프레임워크)
