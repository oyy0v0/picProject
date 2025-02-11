declare namespace API {
  type BaseResponseBoolean_ = {
    code?: number
    data?: boolean
    msg?: string
  }

  type BaseResponseInt_ = {
    code?: number
    data?: number
    msg?: string
  }

  type BaseResponseLoginUserVO_ = {
    code?: number
    data?: LoginUserVO
    msg?: string
  }

  type BaseResponseLong_ = {
    code?: number
    data?: number
    msg?: string
  }

  type BaseResponsePagePicture_ = {
    code?: number
    data?: PagePicture_
    msg?: string
  }

  type BaseResponsePagePictureVO_ = {
    code?: number
    data?: PagePictureVO_
    msg?: string
  }

  type BaseResponsePageUserVO_ = {
    code?: number
    data?: PageUserVO_
    msg?: string
  }

  type BaseResponsePicture_ = {
    code?: number
    data?: Picture
    msg?: string
  }

  type BaseResponsePictureTagCategory_ = {
    code?: number
    data?: PictureTagCategory
    msg?: string
  }

  type BaseResponsePictureVO_ = {
    code?: number
    data?: PictureVO
    msg?: string
  }

  type BaseResponseString_ = {
    code?: number
    data?: string
    msg?: string
  }

  type BaseResponseUser_ = {
    code?: number
    data?: User
    msg?: string
  }

  type BaseResponseUserVO_ = {
    code?: number
    data?: UserVO
    msg?: string
  }

  type DeleteRequest = {
    id?: number
  }

  type getPictureByIdUsingGETParams = {
    /** id */
    id?: number
  }

  type getPictureVOByIdUsingGETParams = {
    /** id */
    id?: number
  }

  type getUserByIdUsingGETParams = {
    /** id */
    id?: number
  }

  type getUserVOByIdUsingGETParams = {
    /** id */
    id?: number
  }

  type LoginUserVO = {
    createTime?: string
    editTime?: string
    id?: number
    updateTime?: string
    userAccount?: string
    userAvatar?: string
    userName?: string
    userProfile?: string
    userRole?: string
  }

  type PagePicture_ = {
    current?: number
    pages?: number
    records?: Picture[]
    size?: number
    total?: number
  }

  type PagePictureVO_ = {
    current?: number
    pages?: number
    records?: PictureVO[]
    size?: number
    total?: number
  }

  type PageUserVO_ = {
    current?: number
    pages?: number
    records?: UserVO[]
    size?: number
    total?: number
  }

  type Picture = {
    category?: string
    createTime?: string
    editTime?: string
    id?: number
    introduction?: string
    isDelete?: number
    name?: string
    picFormat?: string
    picHeight?: number
    picScale?: number
    picSize?: number
    picWidth?: number
    reviewMessage?: string
    reviewStatus?: number
    reviewTime?: string
    reviewerId?: number
    tags?: string
    updateTime?: string
    url?: string
    userId?: number
  }

  type PictureEditRequest = {
    category?: string
    id?: number
    introduction?: string
    name?: string
    tags?: string[]
  }

  type PictureQueryRequest = {
    category?: string
    current?: number
    id?: number
    introduction?: string
    name?: string
    pageSize?: number
    picFormat?: string
    picHeight?: number
    picScale?: number
    picSize?: number
    picWidth?: number
    reviewMessage?: string
    reviewStatus?: number
    reviewTime?: string
    reviewerId?: number
    searchText?: string
    sortField?: string
    sortOrder?: string
    tags?: string[]
    userId?: number
  }

  type PictureReviewRequest = {
    id?: number
    reviewMessage?: string
    reviewStatus?: number
  }

  type PictureTagCategory = {
    categoryList?: string[]
    tagList?: string[]
  }

  type PictureUpdateRequest = {
    category?: string
    id?: number
    introduction?: string
    name?: string
    tags?: string[]
  }

  type PictureUploadByBatchRequest = {
    count?: number
    namePrefix?: string
    searchText?: string
  }

  type PictureUploadRequest = {
    fileUrl?: string
    id?: number
    picName?: string
  }

  type PictureVO = {
    category?: string
    createTime?: string
    editTime?: string
    id?: number
    introduction?: string
    name?: string
    picFormat?: string
    picHeight?: number
    picScale?: number
    picSize?: number
    picWidth?: number
    tags?: string[]
    updateTime?: string
    url?: string
    user?: UserVO
    userId?: number
  }

  type testDownloadFileUsingGETParams = {
    /** filepath */
    filepath?: string
  }

  type uploadPictureUsingPOSTParams = {
    fileUrl?: string
    id?: number
    picName?: string
  }

  type User = {
    createTime?: string
    editTime?: string
    id?: number
    isDelete?: number
    updateTime?: string
    userAccount?: string
    userAvatar?: string
    userName?: string
    userPassword?: string
    userProfile?: string
    userRole?: string
  }

  type UserAddRequest = {
    userAccount?: string
    userAvatar?: string
    userName?: string
    userProfile?: string
    userRole?: string
  }

  type UserLoginRequest = {
    userAccount?: string
    userPassword?: string
  }

  type UserQueryRequest = {
    current?: number
    id?: number
    pageSize?: number
    sortField?: string
    sortOrder?: string
    userAccount?: string
    userName?: string
    userProfile?: string
    userRole?: string
  }

  type UserRegisterRequest = {
    checkPassword?: string
    userAccount?: string
    userPassword?: string
  }

  type UserUpdateRequest = {
    id?: number
    userAvatar?: string
    userName?: string
    userProfile?: string
    userRole?: string
  }

  type UserVO = {
    createTime?: string
    id?: number
    userAccount?: string
    userAvatar?: string
    userName?: string
    userProfile?: string
    userRole?: string
  }
}
