<template>
    <div class="container">
      <div class="row">
        <div class="col-md-8 offset-md-2 mt-4">
          <div class="card card-margin search-form">
            <div class="card-body p-0">
              <form @submit.prevent="search">
                <div class="row">
                  <div class="col-lg-3 col-md-3 col-sm-12 p-0" >
                    <label for="search-type" hidden>검색 유형</label>
                    <select class="form-control" v-model="searchType">
                      <option>제목</option>
                      <option>본문</option>
                      <option>id</option>
                      <option>닉네임</option>
                      <option>해시태그</option>
                    </select>                    
                  </div>
                  <div class="col-lg-8 col-md-6 col-sm-12 p-0">
                    <label for="search-value" hidden>검색어</label>
                    <input type="text" placeholder="검색어..." class="form-control" v-model="searchValue">
                  </div>
                  <div class="col-lg-1 col-md-3 col-sm-12 p-0">
                    <button type="submit" class="btn btn-base">
                      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                           viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                           stroke-linecap="round" stroke-linejoin="round"
                           class="feather feather-search">
                        <circle cx="11" cy="11" r="8"></circle>
                        <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                      </svg>
                    </button>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
  
      <div class="row">
        <table class="table" id="article-table">
          <thead>
          <tr>
            <th class="title col-6"><a>제목</a></th>
            <th class="hashtag col-2"><a>해시태그</a></th>
            <th class="user-id"><a>작성자</a></th>
            <th class="created-at"><a>작성일</a></th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="(article, index) in articles" :key="index">
            <td class="title"><a>{{ article.title }}</a></td>
            <td class="hashtag">{{ article.hashtag }}</td>
            <td class="user-id">{{ article.userId }}</td>
            <td class="created-at">
              <time>{{ article.createdAt }}</time>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
  
      <div class="row">
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
          <button class="btn btn-primary me-md-2" @click="writeArticle">글쓰기</button>
        </div>
      </div>
  
      <div class="row">
        <nav id="pagination" aria-label="Page navigation">
          <ul class="pagination justify-content-center">
            <li class="page-item"><a class="page-link" href="#">Previous</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">Next</a></li>
          </ul>
        </nav>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue';
  
  const searchType = ref('제목');
  const searchValue = ref('');
  const articles = ref([
    {
      title: '첫글',
      hashtag: '#java',
      userId: 'adas',
      createdAt: '2022-01-01',
    },
    {
      title: '두번째글',
      hashtag: '#spring',
      userId: 'fsdfsa',
      createdAt: '2022-01-02',
    },
    {
      title: '세번째글',
      hashtag: '#java',
      userId: 'vsdvsd',
      createdAt: '2022-01-03',
    },
    // 기타 게시물 데이터 추가
  ]);
  
  const search = () => {
    // 검색 기능을 구현하려면 이 곳에 검색 로직을 추가하세요.
  };
  
  const writeArticle = () => {
    // 글쓰기 기능을 구현하려면 이 곳에 글쓰기 로직을 추가하세요.
  };
  </script>
  
  <style scoped>
  .container{
   /* margin-left : 150px; */
  }
            .search-form {
  width: 80%;
  margin: 0 auto;
  margin-top: 1rem;
}

.search-form input {
  height: 100%;
  background: transparent;
  border: 0;
  display: block;
  width: 100%;
  padding: 1rem;
  height: 100%;
  font-size: 1rem;
}

.search-form select {
  background: transparent;
  border: 0;
  padding: 1rem;
  height: 100%;
  font-size: 1rem;
}

.search-form select:focus {
  border: 0;
}

.search-form button {
  height: 100%;
  width: 100%;
  font-size: 1rem;
}

.search-form button svg {
  width: 24px;
  height: 24px;
}

.card-margin {
  margin-bottom: 2.5rem;
}

@media (min-width: 992px) {
  .col-lg-2 {
    flex: 0 0 16.66667%;
    max-width: 16.66667%;
  }
}

.card {
  border: 0;
  box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -webkit-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -moz-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -ms-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
}

.card {
  position: relative;
  display: flex;
  flex-direction: column;
  min-width: 0;
  word-wrap: break-word;
  background-color: #ffffff;
  background-clip: border-box;
  border: 1px solid #e6e4e9;
  border-radius: 8px;
}
    

    
  </style>
  