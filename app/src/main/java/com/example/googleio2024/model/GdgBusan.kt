package com.example.googleio2024.model

val gdgBusanOrganizers =
    listOf(
        Organizer(
            id = 1L,
            name = "최성훈",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/seonghoon_choi.png",
        ),
        Organizer(
            id = 2L,
            name = "남우진",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/%EC%9A%B0%EC%A7%84_%EB%82%A8_KWfaM0O.jpg",
        ),
        Organizer(
            id = 3L,
            name = "이채윤",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/%EC%B1%84%EC%9C%A4_%EC%9D%B4.jpg",
        ),
        // 서예진
        Organizer(
            id = 4L,
            name = "서예진",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/%EC%98%88%EC%A7%84_%EC%84%9C.png",
        ),
        // 천명기
        Organizer(
            id = 5L,
            name = "천명기",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/myeong_gi_cheon_NTD5xfs.jpg",
        ),
        // 성기동
        Organizer(
            id = 6L,
            name = "성기동",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/featured_attendees/SeongGiDong.png",
        ),
        // 우종성
        Organizer(
            id = 7L,
            name = "우종성",
            "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_250,h_250,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/avatars/jongseong_woo.jpg",
        ),
    )

val gdgBusanEvents =
    listOf(
        Event(
            id = 1L,
            name = "Build With AI 2024 BUSAN",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/events/2_f8rsWMf.png",
            date = "2024.04.13",
            category = "Workshop / Study Group",
        ),
        Event(
            id = 2L,
            name = "DevFest Busan 2023",
            imageUrl = "https://cf.festa.io/img/2023-10-30/8c24cdb6-76e8-4323-acd7-82c0dce08031.png",
            date = "2023.09.02",
            category = "Conference",
        ),
        Event(
            id = 3L,
            name = "I/O Extended 2023 BUSAN, Cloud BUSAN",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/events/Untitled_DavlKwM.png",
            date = "2023.09.02",
            category = "Conference",
        ),
        Event(
            id = 4L,
            name = "Go to Busan 2023",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/events/4535.jpg",
            date = "2023.06.03",
            category = "Conference",
        ),
        // "GDG Busan Devfest 2022, 부산에서 개발하는 사람들", 2022 11 19, Conference
        Event(
            id = 5L,
            name = "GDG Busan Devfest 2022, 부산에서 개발하는 사람들",
            imageUrl = "https://static.onoffmix.com/afv2/thumbnail/2022/11/13/18cd87b05c633d0af8fc6ad210f63aab.png",
            date = "2022.11.19",
            category = "Conference",
        ),
        // 같이하는 Kubernetes StudyJam, 2022 10 30, Workshop / Study Group
        Event(
            id = 6L,
            name = "같이하는 Kubernetes StudyJam",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/fetch/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/https://res.cloudinary.com/startup-grind/image/upload/c_fill%2Cdpr_2.0%2Cf_auto%2Cg_center%2Cq_auto:good/v1/gcs/platform-data-goog/event_banners/gdev-eccosystems-bevy-chapters-thumbnail_x4z1EBy.png",
            date = "2022.10.30",
            category = "Workshop / Study Group",
        ),
        // GDG Busan Devfest 2021, 2021 11 27, Conference
        Event(
            id = 7L,
            name = "GDG Busan Devfest 2021",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRplvcZpiw0VWtomGceKe9IviIzD9rOZYbQRg&s",
            date = "2021.11.27",
            category = "Conference",
        ),
        // GDG Busan, 방구석 MSA on GCP 2021.02.21, Cloud Study Jam - Virtual
        Event(
            id = 8L,
            name = "GDG Busan, 방구석 MSA on GCP",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/fetch/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/https://res.cloudinary.com/startup-grind/image/upload/c_fill%2Cdpr_2.0%2Cf_auto%2Cg_center%2Cq_auto:good/v1/gcs/platform-data-goog/event_banners/green%2520sj%2520thumbnail%25201080%2520x%25201080_Ub2bpuB.png",
            date = "2021.02.21",
            category = "Cloud Study Jam - Virtual",
        ),
        // "우당탕탕 촙오 캐글 노트북 읽기", DevFest 2020, 2020 10 17, Conference
        Event(
            id = 9L,
            name = "우당탕탕 촙오 캐글 노트북 읽기",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/events/%EB%B6%80%EC%82%B0_XpfW6zQ.png",
            date = "2020.10.17",
            category = "Conference",
        ),
    )
