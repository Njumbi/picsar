package com.example.picsar.ui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

class TopicResponse : ArrayList<TopicResponseItem>() {}

@Keep
data class TopicResponseItem(
    @SerializedName("cover_photo")
    var coverPhoto: CoverPhoto?,
    @SerializedName("current_user_contributions")
    var currentUserContributions: List<Any?>?,
    @SerializedName("description")
    var description: String?, // Beautiful analog photography from the past and present day — featuring polaroids, black &amp; white images, grainy portraits, and more.
    @SerializedName("ends_at")
    var endsAt: String?, // 2021-08-31T23:59:59Z
    @SerializedName("featured")
    var featured: Boolean?, // true
    @SerializedName("id")
    var id: String?, // hmenvQhUmxM
    @SerializedName("links")
    var links: Links?,
    @SerializedName("only_submissions_after")
    var onlySubmissionsAfter: Any?, // null
    @SerializedName("owners")
    var owners: List<Owner?>?,
    @SerializedName("preview_photos")
    var previewPhotos: List<PreviewPhoto?>?,
    @SerializedName("published_at")
    var publishedAt: String?, // 2020-04-06T10:20:16-04:00
    @SerializedName("slug")
    var slug: String?, // film
    @SerializedName("starts_at")
    var startsAt: String?, // 2020-04-15T00:00:00Z
    @SerializedName("status")
    var status: String?, // open
    @SerializedName("title")
    var title: String?, // Film
    @SerializedName("total_current_user_submissions")
    var totalCurrentUserSubmissions: Any?, // null
    @SerializedName("total_photos")
    var totalPhotos: Int?, // 5681
    @SerializedName("updated_at")
    var updatedAt: String? // 2021-08-17T04:00:22-04:00
) {}

@Keep
data class CoverPhoto(
    @SerializedName("alt_description")
    var altDescription: String?, // climber standing on rock near overlooking view of mountain at daytime
    @SerializedName("blur_hash")
    var blurHash: String?, // L-K1aZIoM|t6~qRjaxa#xvt6s:WB
    @SerializedName("categories")
    var categories: List<Any?>?,
    @SerializedName("color")
    var color: String?, // #f3f3f3
    @SerializedName("created_at")
    var createdAt: String?, // 2013-11-19T03:55:13-05:00
    @SerializedName("current_user_collections")
    var currentUserCollections: List<Any?>?,
    @SerializedName("description")
    var description: Any?, // null
    @SerializedName("height")
    var height: Int?, // 1830
    @SerializedName("id")
    var id: String?, // tvicgTdh7Fg
    @SerializedName("liked_by_user")
    var likedByUser: Boolean?, // false
    @SerializedName("likes")
    var likes: Int?, // 720
    @SerializedName("links")
    var links: Links?,
    @SerializedName("promoted_at")
    var promotedAt: String?, // 2013-11-19T03:55:13-05:00
    @SerializedName("sponsorship")
    var sponsorship: Any?, // null
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-17T06:00:06-04:00
    @SerializedName("urls")
    var urls: Urls?,
    @SerializedName("user")
    var user: User?,
    @SerializedName("width")
    var width: Int? // 2515
) {}

@Keep
data class Owner(
    @SerializedName("accepted_tos")
    var acceptedTos: Boolean?, // true
    @SerializedName("bio")
    var bio: String?, // Behind the scenes of the team building the internet’s open library of freely useable visuals.
    @SerializedName("first_name")
    var firstName: String?, // Unsplash
    @SerializedName("for_hire")
    var forHire: Boolean?, // false
    @SerializedName("id")
    var id: String?, // QV5S1rtoUJ0
    @SerializedName("instagram_username")
    var instagramUsername: String?, // unsplash
    @SerializedName("last_name")
    var lastName: Any?, // null
    @SerializedName("links")
    var links: Links?,
    @SerializedName("location")
    var location: String?, // Montreal, Canada
    @SerializedName("name")
    var name: String?, // Unsplash
    @SerializedName("portfolio_url")
    var portfolioUrl: String?, // https://unsplash.com
    @SerializedName("profile_image")
    var profileImage: ProfileImage?,
    @SerializedName("social")
    var social: Social?,
    @SerializedName("total_collections")
    var totalCollections: Int?, // 5
    @SerializedName("total_likes")
    var totalLikes: Int?, // 16329
    @SerializedName("total_photos")
    var totalPhotos: Int?, // 29
    @SerializedName("twitter_username")
    var twitterUsername: String?, // unsplash
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-17T12:20:03-04:00
    @SerializedName("username")
    var username: String? // unsplash
) {}

@Keep
data class PreviewPhoto(
    @SerializedName("blur_hash")
    var blurHash: String?, // LNCt2=xZ4mWCPWWA$zoJ9tRjtSV@
    @SerializedName("created_at")
    var createdAt: String?, // 2020-09-09T06:50:21-04:00
    @SerializedName("id")
    var id: String?, // ZGxt6F4ZDT4
    @SerializedName("updated_at")
    var updatedAt: String?, // 2021-08-16T20:24:31-04:00
    @SerializedName("urls")
    var urls: Urls?
)
