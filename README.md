## Dowon Repository
---
## 🛩️ 작업할 내용
상품기능을 구현합니다.

### ☑️ Todos
- [x] 상품명과 가격을 입력받아 Item 객체 생성
 - [x] ItemRepository에 저장
- [x] 저장된 상품 리스트를 콘솔에 출력
   (이름 가격)

  
[//]: # (상품 정보 수정 )

[//]: # (삭제가능 )

## ✅ 작업 한 내용
- 상품 등록, 전체 목록 조회, 상품 수정 기능을 MVC 패턴에 맞게 분리하여 구현

- Item 객체를 사용자의 입력을 받아 생성하고, HashMap을 통해 저장

- id는 1번부터 자동 증가되며 중복되지 않도록 설계

- 전체 목록은 저장된 HashMap의 값을 기반으로 출력

- 수정 기능은 ID 기준으로 해당 아이템의 이름과 가격을 변경

폴더 구조는 기능 단위(list, registration, revise, ui)로 나누어 구성
- 

![image](https://github.com/user-attachments/assets/c4fb8d13-9ff0-4d64-a667-b9bbb2815ba0)

### ☑️ TodosNext
- [x] 상품명중복 체크
 - [x] 상품 가격 유효성 검사 (0보다 커야 함 등)
- [x] 회원이 등록한 상품을 구분해서 저장