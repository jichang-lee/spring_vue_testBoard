<template>
  <div class="sidebar-container">
    <a href="/" class="logo-title">
      <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"></use></svg>
      <span class="fs-4">toyss</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
  <li class="nav-item">
    <a href="#" class="nav-link active" aria-current="page" style="color: white; background-color: transparent;">
      <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"></use></svg>
      Home
    </a>
  </li>
  <!-- 나머지 메뉴 항목들 -->
</ul>
    <hr>
    <ul class="nav flex-column">
      <li class="nav-item">
        <a href="#" class="nav-link">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#new-project"></use></svg>
          New project...
        </a>
      </li>
      <li class="nav-item">
        <a href="#" class="nav-link">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#settings"></use></svg>
          Settings
        </a>
      </li>
      <li class="nav-item">
        <a href="#" class="nav-link">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#profile"></use></svg>
          Profile
        </a>
      </li>
      <li class="nav-item">
        <a href="#" class="nav-link">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#sign-out"></use></svg>
          Sign out
        </a>
      </li>
    </ul>
  </div>
</template>

<style scoped>
/* 스타일링을 위한 CSS 코드 */
.sidebar-container {
  width: 280px;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
  background-color: #f89973; /* 원하는 배경색으로 변경하세요 */
  color: white;
  overflow-y: auto; /* 내용이 넘칠 경우 스크롤 생성 */
  border-radius: 10px;
  margin-left: 13px;
  
}
.nav-item {
  
}
.logo-title {
  display: flex;
  align-items: center;
  margin-bottom: 20px;
  padding: 10px;
}

.logo-title svg {
  width: 40px;
  height: 32px;
  margin-right: 10px;
}

.nav-link {
  color: white;
  padding: 8px 20px; /* 메뉴 항목의 패딩 조정 */
  border-radius: 5px; /* 선택적으로 메뉴 항목에 둥근 모서리 추가 */
  text-align: left; /* 텍스트 가운데 정렬 추가 */
}

.nav-link:hover {
  background-color: #545b62; /* 호버 효과를 원하는 색상으로 변경 */
}
</style>

