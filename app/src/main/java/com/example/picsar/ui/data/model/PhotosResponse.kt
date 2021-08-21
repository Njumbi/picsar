package com.example.picsar.ui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

class PhotosResponse : ArrayList<PhotosResponseItem>() {}

@Keep
data class PhotosResponseItem(
    @SerializedName("alt_description")
    var altDescription: String?, // brown rocky mountain under white sky during daytime
    @SerializedName("blur_hash")
    var blurHash: String?, // LVDlycR*ayof~qWBayfRIrayj@WC
    @SerializedName("categories")
    var categories: List<Any?>?,
    @SerializedName("color")
    var color: String?, // #0c2626
    @SerializedName("created_at")
    var createdAt: String?, // 2021-08-15T12:35:48-04:00
    @SerializedName("current_user_collections")
    var currentUserCollections: List<Any?>?,
    @SerializedName("description")
    var description: Any?, // null
    @SerializedName("height")
    var height: Int?, // 5472
    @SerializedName("id")
    var id: String?, // OV_Zi82m63U
    @SerializedName("liked_by_user")
    var likedByUser: Boolean?, // false
    @SerializedName("likes")
    var likes: Int?, // 72
    @SerializedName("links")
    var links: UrlLinks?,
    @SerializedName("promoted_at")
    var promotedAt: String?, // 2021-08-15T19:48:02-04:00
    @SerializedName("sponsorship")
    var sponsorship: Sponsorship?,
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-16T03:15:15-04:00
    @SerializedName("urls")
    var urls: Urls?,
    @SerializedName("user")
    var user: User?,
    @SerializedName("width")
    var width: Int? // 3648
) {}

@Keep
data class UrlLinks(
    @SerializedName("download")
    var download: String?, // https://unsplash.com/photos/OV_Zi82m63U/download
    @SerializedName("download_location")
    var downloadLocation: String?, // https://api.unsplash.com/photos/OV_Zi82m63U/download?ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ
    @SerializedName("html")
    var html: String?, // https://unsplash.com/photos/OV_Zi82m63U
    @SerializedName("self")
    var self: String? // https://api.unsplash.com/photos/OV_Zi82m63U
)

@Keep
data class Sponsorship(
    @SerializedName("impression_urls")
    var impressionUrls: List<Any?>?,
    @SerializedName("sponsor")
    var sponsor: Sponsor?,
    @SerializedName("tagline")
    var tagline: String?, // Keep it real. Keep it Tyson.
    @SerializedName("tagline_url")
    var taglineUrl: String? // https://www.tyson.com/
) {}

@Keep
data class Sponsor(
    @SerializedName("accepted_tos")
    var acceptedTos: Boolean?, // true
    @SerializedName("bio")
    var bio: String?, // Keep it real. Keep it Tyson.
    @SerializedName("first_name")
    var firstName: String?, // Tyson
    @SerializedName("for_hire")
    var forHire: Boolean?, // false
    @SerializedName("id")
    var id: String?, // PBsQSpJagYQ
    @SerializedName("instagram_username")
    var instagramUsername: String?, // tysonbrand
    @SerializedName("last_name")
    var lastName: Any?, // null
    @SerializedName("links")
    var links: SocialLinks?,
    @SerializedName("location")
    var location: Any?, // null
    @SerializedName("name")
    var name: String?, // Tyson
    @SerializedName("portfolio_url")
    var portfolioUrl: String?, // https://www.tyson.com/
    @SerializedName("profile_image")
    var profileImage: UserImage?,
    @SerializedName("social")
    var social: SocialMedia?,
    @SerializedName("total_collections")
    var totalCollections: Int?, // 0
    @SerializedName("total_likes")
    var totalLikes: Int?, // 0
    @SerializedName("total_photos")
    var totalPhotos: Int?, // 31
    @SerializedName("twitter_username")
    var twitterUsername: String?,
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-16T03:40:46-04:00
    @SerializedName("username")
    var username: String? // tysonbrand
) {}

@Keep
data class SocialLinks(
    @SerializedName("followers")
    var followers: String?, // https://api.unsplash.com/users/tysonbrand/followers
    @SerializedName("following")
    var following: String?, // https://api.unsplash.com/users/tysonbrand/following
    @SerializedName("html")
    var html: String?, // https://unsplash.com/@tysonbrand
    @SerializedName("likes")
    var likes: String?, // https://api.unsplash.com/users/tysonbrand/likes
    @SerializedName("photos")
    var photos: String?, // https://api.unsplash.com/users/tysonbrand/photos
    @SerializedName("portfolio")
    var portfolio: String?, // https://api.unsplash.com/users/tysonbrand/portfolio
    @SerializedName("self")
    var self: String? // https://api.unsplash.com/users/tysonbrand
)

@Keep
data class UserImage(
    @SerializedName("large")
    var large: String?, // https://images.unsplash.com/profile-1625772672316-7eda84f9ffc5image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128
    @SerializedName("medium")
    var medium: String?, // https://images.unsplash.com/profile-1625772672316-7eda84f9ffc5image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64
    @SerializedName("small")
    var small: String? // https://images.unsplash.com/profile-1625772672316-7eda84f9ffc5image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32
)

@Keep
data class SocialMedia(
    @SerializedName("instagram_username")
    var instagramUsername: String?, // tysonbrand
    @SerializedName("paypal_email")
    var paypalEmail: Any?, // null
    @SerializedName("portfolio_url")
    var portfolioUrl: String?, // https://www.tyson.com/
    @SerializedName("twitter_username")
    var twitterUsername: String?
)


@Keep
data class Urls(
    @SerializedName("full")
    var full: String?, // https://images.unsplash.com/photo-1629045198735-9d1c675e6d5d?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ&ixlib=rb-1.2.1&q=85
    @SerializedName("raw")
    var raw: String?, // https://images.unsplash.com/photo-1629045198735-9d1c675e6d5d?ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ&ixlib=rb-1.2.1
    @SerializedName("regular")
    var regular: String?, // https://images.unsplash.com/photo-1629045198735-9d1c675e6d5d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ&ixlib=rb-1.2.1&q=80&w=1080
    @SerializedName("small")
    var small: String?, // https://images.unsplash.com/photo-1629045198735-9d1c675e6d5d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ&ixlib=rb-1.2.1&q=80&w=400
    @SerializedName("thumb")
    var thumb: String? // https://images.unsplash.com/photo-1629045198735-9d1c675e6d5d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNTI5NTR8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2MjkwOTk3NzQ&ixlib=rb-1.2.1&q=80&w=200
)

@Keep
data class User(
    @SerializedName("accepted_tos")
    var acceptedTos: Boolean?, // true
    @SerializedName("bio")
    var bio: String?, // visual loving, art appreciating, maintitle admiring human.art stuff from my 365 daily challange on instgram: @will_willert , my commercial film work on my company website: www.lowfidelity.at.
    @SerializedName("first_name")
    var firstName: String?, // Alex
    @SerializedName("for_hire")
    var forHire: Boolean?, // false
    @SerializedName("id")
    var id: String?, // _E0btZ1TfMw
    @SerializedName("instagram_username")
    var instagramUsername: String?, // will_willert
    @SerializedName("last_name")
    var lastName: String?, // Gruber
    @SerializedName("links")
    var links: Links?,
    @SerializedName("location")
    var location: String?, // Vienna
    @SerializedName("name")
    var name: String?, // Alex Gruber
    @SerializedName("portfolio_url")
    var portfolioUrl: String?, // http://www.lowfidelity.at
    @SerializedName("profile_image")
    var profileImage: ProfileImage?,
    @SerializedName("social")
    var social: Social?,
    @SerializedName("total_collections")
    var totalCollections: Int?, // 5
    @SerializedName("total_likes")
    var totalLikes: Int?, // 908
    @SerializedName("total_photos")
    var totalPhotos: Int?, // 158
    @SerializedName("twitter_username")
    var twitterUsername: String?, // m0c0000
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-16T03:38:08-04:00
    @SerializedName("username")
    var username: String? // alex_gruber
) {}

@Keep
data class Links(
    @SerializedName("followers")
    var followers: String?, // https://api.unsplash.com/users/alex_gruber/followers
    @SerializedName("following")
    var following: String?, // https://api.unsplash.com/users/alex_gruber/following
    @SerializedName("html")
    var html: String?, // https://unsplash.com/@alex_gruber
    @SerializedName("likes")
    var likes: String?, // https://api.unsplash.com/users/alex_gruber/likes
    @SerializedName("photos")
    var photos: String?, // https://api.unsplash.com/users/alex_gruber/photos
    @SerializedName("portfolio")
    var portfolio: String?, // https://api.unsplash.com/users/alex_gruber/portfolio
    @SerializedName("self")
    var self: String? // https://api.unsplash.com/users/alex_gruber
)

@Keep
data class ProfileImage(
    @SerializedName("large")
    var large: String?, // https://images.unsplash.com/profile-1537596850074-1b4b0ce97f33?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128
    @SerializedName("medium")
    var medium: String?, // https://images.unsplash.com/profile-1537596850074-1b4b0ce97f33?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64
    @SerializedName("small")
    var small: String? // https://images.unsplash.com/profile-1537596850074-1b4b0ce97f33?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32
)

@Keep
data class Social(
    @SerializedName("instagram_username")
    var instagramUsername: String?, // will_willert
    @SerializedName("paypal_email")
    var paypalEmail: Any?, // null
    @SerializedName("portfolio_url")
    var portfolioUrl: String?, // http://www.lowfidelity.at
    @SerializedName("twitter_username")
    var twitterUsername: String? // m0c0000
)
